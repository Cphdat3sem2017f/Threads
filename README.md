# Concurrency and Threads

## Plan

### [Day 1](Day1) - Concurency, Thread, Runnable, basic Synchronozation

### Day 2 - Threads Continued, Producer Consumer, DeadLocks

### [Day 3](Day3) - Thread Continued, Callables and Futures

### Day 4 - JavaScript, AJAX, JSON continue

### Day 5 - Study point exercises

## Learning objectives (Concurrency/threads)
- Learn the fundamental topics related to concurrency and thread programming
- Understand the general problems (unrelated to the number of kernels)that can be solved using concurrency
- Learn how to take advantage, programmatically, of modern multi-kernel CPU's

## Business competences (Concurrency/threads)

As a programmer there are problems that can only (realistically) be solved using concurrency features

Taking advantage of modern multi-kernel CPU requires an understanding of how to program with threads

These lessons will provide student with the necessary background to use these features in any language/platform but are presented via Java


## Exercises 
- [Exercises Day-1](https://docs.google.com/document/d/1zezTIruAiSkhhNCRHJh4EYOcf_mgMblGs6U_XmQ3vp4/edit?usp=sharing)
- [Exercises Day-2](https://docs.google.com/document/d/1A3rBzbbppVZKx-YrGJKWdgsWKs8xNrTR2BeG7zVu6hg/edit?usp=sharing) (Producer/Consumer and Deadlocks)
- [Exercises Day-3](https://docs.google.com/document/d/1AkC59GQm5sbwWpKkideE9kI9KmbscIwKOygn9b_FJMU/edit?usp=sharing) (Using an executor service)

## Resources: 

### General

### Day-1

* [The well-grounded Java developer](https://manning-content.s3.amazonaws.com/download/e/15b9513-9763-41e7-9178-5cded4d02996/TWGJD_sample_ch04.pdf) -- I recommend reading the introduction, 4.1.1 (and the 4.1 intro), 4.1.3, 4.2.1 (and the 4.2 intro) and 4.6 **after the lecture**.
* [slides](https://docs.google.com/presentation/d/1BInXQP497r0TLDH7xUP7Oc06LcHXHkU58IocN-g3djo/edit?usp=sharing)


### Day-2

- [Watch this SHORT video before the lesson to get a conceptual idea about the Producer-Consumer Problem](https://www.youtube.com/watch?v=VXJSJ6c3ZIs)
- [Producer/Consumer Solution using BlockingQueue](http://www.java67.com/2015/12/producer-consumer-solution-using-blocking-queue-java.html)
- [Deadlock](https://en.wikipedia.org/wiki/Deadlock)
- [Slides](https://docs.google.com/presentation/d/1GVBy3TSMdaFfSZphN79utRxk1koPO8i9NuNoCX3lKNs/edit?usp=sharing)
- [Code Snippets](https://docs.google.com/document/d/1UwsbhJWybxGbCzWB-pYp8VLeJdGwYsxlsAJvpinZGlc/edit?usp=sharing)

### Day-3
These are not "read it all" resources, but "get an overview", and "use for
looking up things later" resources. You should still skim them to get an
overview.

* [Java ExecutorService api doc](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html#submit(java.util.concurrent.Callable)) -- The ExecuterService interface.
* [Java Executors class](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executors.html) -- has static methods to instantiate common executor services.
* [Java Future api doc](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Future.html) -- the actual future class
* [Java CompletableFuture api doc](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html) -- the actual CompletableFuture class
* [Java callable api doc](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html) -- the actual future class
* [Slides](Day3)
