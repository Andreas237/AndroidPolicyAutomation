.class Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;
.super Ljava/lang/Object;
.source "AsyncPersistentStringQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PersistentQueueTaskInfo"
.end annotation


# instance fields
.field public stringToWrite:Ljava/lang/String;

.field public stringsToWrite:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public taskType:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V
    .locals 0

    .line 236
    invoke-direct {p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskInfo;-><init>()V

    return-void
.end method
