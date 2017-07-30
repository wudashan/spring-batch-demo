package demo;

import org.springframework.batch.item.file.LineMapper;

/**
 * ORM
 * Created by wuzhaofeng on 17/7/23.
 */
public class HelloLineMapper implements LineMapper<DeviceCommand> {

    @Override
    public DeviceCommand mapLine(String line, int lineNumber) throws Exception {

        String[] args = line.split(",");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setId(args[0]);
        deviceCommand.setStatus(args[1]);
        return deviceCommand;

    }

}
