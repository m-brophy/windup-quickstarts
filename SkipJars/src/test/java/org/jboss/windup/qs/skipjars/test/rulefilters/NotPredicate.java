package org.jboss.windup.qs.skipjars.test.rulefilters;


import org.jboss.forge.furnace.util.Predicate;
import org.jboss.windup.config.WindupRuleProvider;

/**
 * NOT predicate which negates the result of given predicate..
 *
 * @author Ondrej Zizka, ozizka at redhat.com
 */
public class NotPredicate implements Predicate<WindupRuleProvider>
{
    protected final Predicate predicate;


    public NotPredicate(Predicate pred)
    {
        this.predicate = pred;
    }

    @Override
    public boolean accept(WindupRuleProvider provider)
    {
        return ! this.predicate.accept(provider);
    }

}
