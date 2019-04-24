.class public final enum Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;
.super Ljava/lang/Enum;
.source "SKPersistentQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/queue/SKPersistentQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PersistentQueueType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

.field public static final enum QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

.field public static final enum QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 35
    new-instance v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    const-string v1, "QUEUE_TYPE_STRING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    .line 36
    new-instance v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    const-string v1, "QUEUE_TYPE_API_WRAPPER_OBJECT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    const/4 v0, 0x2

    .line 34
    new-array v0, v0, [Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->$VALUES:[Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;
    .locals 1

    .line 34
    const-class v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;
    .locals 1

    .line 34
    sget-object v0, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->$VALUES:[Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-virtual {v0}, [Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    return-object v0
.end method
