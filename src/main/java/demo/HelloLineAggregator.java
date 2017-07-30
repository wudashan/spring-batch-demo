package demo;

import org.springframework.batch.item.file.transform.LineAggregator;

/**
 * Created by wuzhaofeng on 17/7/23.
 */
public class HelloLineAggregator implements LineAggregator<DeviceCommand> {

    @Override
    public String aggregate(DeviceCommand deviceCommand) {

        StringBuffer sb = new StringBuffer();
        sb.append(deviceCommand.getId());
        sb.append(",");
        sb.append(deviceCommand.getStatus());
        return sb.toString();

    }

}
