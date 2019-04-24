.class final enum Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;
.super Ljava/lang/Enum;
.source "AsyncPersistentStringQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "PersistentQueueTaskType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

.field public static final enum READ:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

.field public static final enum REMOVE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

.field public static final enum WRITE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 231
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    const-string v1, "READ"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->READ:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    .line 232
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    const-string v1, "WRITE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->WRITE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    .line 233
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    const-string v1, "REMOVE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->REMOVE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    const/4 v0, 0x3

    .line 230
    new-array v0, v0, [Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    sget-object v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->READ:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->WRITE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->REMOVE:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->$VALUES:[Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 230
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;
    .locals 1

    .line 230
    const-class v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;
    .locals 1

    .line 230
    sget-object v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->$VALUES:[Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    invoke-virtual {v0}, [Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$PersistentQueueTaskType;

    return-object v0
.end method
