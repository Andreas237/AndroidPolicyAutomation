.class final Lorg/apache/commons/io/FileCleaningTracker$Reaper;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/io/FileCleaningTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "Reaper"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/commons/io/FileCleaningTracker;


# direct methods
.method constructor <init>(Lorg/apache/commons/io/FileCleaningTracker;)V
    .locals 1

    .line 208
    iput-object p1, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    .line 209
    const-string v0, "File Reaper"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 210
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->setPriority(I)V

    .line 211
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->setDaemon(Z)V

    .line 212
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 221
    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    iget-boolean v0, v0, Lorg/apache/commons/io/FileCleaningTracker;->exitWhenFinished:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    iget-object v0, v0, Lorg/apache/commons/io/FileCleaningTracker;->trackers:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 224
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    iget-object v0, v0, Lorg/apache/commons/io/FileCleaningTracker;->q:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/FileCleaningTracker$Tracker;

    .line 225
    iget-object v0, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    iget-object v0, v0, Lorg/apache/commons/io/FileCleaningTracker;->trackers:Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 226
    invoke-virtual {v2}, Lorg/apache/commons/io/FileCleaningTracker$Tracker;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 227
    iget-object v0, p0, Lorg/apache/commons/io/FileCleaningTracker$Reaper;->this$0:Lorg/apache/commons/io/FileCleaningTracker;

    iget-object v0, v0, Lorg/apache/commons/io/FileCleaningTracker;->deleteFailures:Ljava/util/List;

    invoke-virtual {v2}, Lorg/apache/commons/io/FileCleaningTracker$Tracker;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_1
    invoke-virtual {v2}, Lorg/apache/commons/io/FileCleaningTracker$Tracker;->clear()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    goto :goto_0

    .line 230
    :catch_0
    move-exception v2

    .line 231
    goto :goto_0

    .line 234
    :cond_2
    return-void
.end method
