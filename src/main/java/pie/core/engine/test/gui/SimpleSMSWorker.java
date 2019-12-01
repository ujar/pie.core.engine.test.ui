/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pie.core.engine.test.gui;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pie.core.adapter.AbstractWorkerAdapter;
import pie.core.adapter.IWorkerAdapter;
import pie.core.engine.Event;

/**
 *
 * @author Raju
 */
public class SimpleSMSWorker extends AbstractWorkerAdapter {

    
    
     @Deprecated
    public SimpleSMSWorker() {
        this.setWakeupDelay(120);
        this.setTimeUnit(TimeUnit.SECONDS);
    }

    public SimpleSMSWorker(long wakeupDelay, TimeUnit timeUnit) {
        this.setWakeupDelay(wakeupDelay);
        this.setTimeUnit(timeUnit);
    }
    
    @Override
    public <T extends IWorkerAdapter> T getWorkerId() {
        return (T) this;
    }

    @Override
    public List<Event> loadRealTime() {
       System.out.println("this is load real time method inside " + this.getClass().getName());
        return null;
    }

    @Override
    public List<Event> loadFromPersistant() {
         List<Event> list = new LinkedList<Event>();
         return list;
    }

    @Override
    public List<Event> save(List<Event> events) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event get(Long eventId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
