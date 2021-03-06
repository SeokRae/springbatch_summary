package kr.seok.common.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomItemReaderListener<T> implements ItemReadListener<T> {
    @Override
    public void beforeRead() {
        // log.info("[LOG] [READER] [BEFORE]");
    }

    @Override
    public void afterRead(T item) {
        log.info("[LOG] [READER] [DATA] [{}]", item);
    }

    @Override
    public void onReadError(Exception ex) {
        log.error("[LOG] [READER] [ERROR]");
    }
}
