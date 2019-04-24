.class final enum Lcom/shopkick/logging/RemoteAppender$ThreadState;
.super Ljava/lang/Enum;
.source "RemoteAppender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/logging/RemoteAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ThreadState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/logging/RemoteAppender$ThreadState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field public static final enum STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field public static final enum STARTING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field public static final enum STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field public static final enum STOPPING:Lcom/shopkick/logging/RemoteAppender$ThreadState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 78
    new-instance v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const-string v1, "STARTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/logging/RemoteAppender$ThreadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 80
    new-instance v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const-string v1, "STARTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/logging/RemoteAppender$ThreadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 82
    new-instance v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const-string v1, "STOPPING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/logging/RemoteAppender$ThreadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 84
    new-instance v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const-string v1, "STOPPED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/logging/RemoteAppender$ThreadState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const/4 v0, 0x4

    .line 76
    new-array v0, v0, [Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->$VALUES:[Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/logging/RemoteAppender$ThreadState;
    .locals 1

    .line 76
    const-class v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/logging/RemoteAppender$ThreadState;
    .locals 1

    .line 76
    sget-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->$VALUES:[Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-virtual {v0}, [Lcom/shopkick/logging/RemoteAppender$ThreadState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-object v0
.end method
