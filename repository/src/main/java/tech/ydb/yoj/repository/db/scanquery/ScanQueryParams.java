package tech.ydb.yoj.repository.db.scanquery;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import tech.ydb.yoj.ExperimentalApi;

@Value
@Builder
public class ScanQueryParams<PARAMS> {

    /**
     * Set this to {@code true} to use a {@code Spliterator} contract-conformant and less memory consuming implementation for the {@code Stream}
     * returned by {@code readTable()}.
     * <p>Note that using the new implementation currently has a negative performance impact, for more information refer to
     * <a href="https://github.com/ydb-platform/yoj-project/issues/42">GitHub Issue #42</a>.
     */
    @ExperimentalApi(issue = "https://github.com/ydb-platform/yoj-project/issues/42")
    boolean useNewSpliterator;

    boolean ordered;

    @NonNull
    PARAMS queryParams;
}
