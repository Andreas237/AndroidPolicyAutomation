.class public final enum Lme/pushy/sdk/util/PushyAsyncTask$Status;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/util/PushyAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lme/pushy/sdk/util/PushyAsyncTask$Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lme/pushy/sdk/util/PushyAsyncTask$Status;

.field public static final enum FINISHED:Lme/pushy/sdk/util/PushyAsyncTask$Status;

.field public static final enum PENDING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

.field public static final enum RUNNING:Lme/pushy/sdk/util/PushyAsyncTask$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lme/pushy/sdk/util/PushyAsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->PENDING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;

    const-string v1, "RUNNING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lme/pushy/sdk/util/PushyAsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->RUNNING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    new-instance v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;

    const-string v1, "FINISHED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lme/pushy/sdk/util/PushyAsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->FINISHED:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    const/4 v0, 0x3

    new-array v0, v0, [Lme/pushy/sdk/util/PushyAsyncTask$Status;

    sget-object v1, Lme/pushy/sdk/util/PushyAsyncTask$Status;->PENDING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    aput-object v1, v0, v2

    sget-object v1, Lme/pushy/sdk/util/PushyAsyncTask$Status;->RUNNING:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    aput-object v1, v0, v3

    sget-object v1, Lme/pushy/sdk/util/PushyAsyncTask$Status;->FINISHED:Lme/pushy/sdk/util/PushyAsyncTask$Status;

    aput-object v1, v0, v4

    sput-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->$VALUES:[Lme/pushy/sdk/util/PushyAsyncTask$Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lme/pushy/sdk/util/PushyAsyncTask$Status;
    .locals 1

    const-class v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lme/pushy/sdk/util/PushyAsyncTask$Status;

    return-object p0
.end method

.method public static values()[Lme/pushy/sdk/util/PushyAsyncTask$Status;
    .locals 1

    sget-object v0, Lme/pushy/sdk/util/PushyAsyncTask$Status;->$VALUES:[Lme/pushy/sdk/util/PushyAsyncTask$Status;

    invoke-virtual {v0}, [Lme/pushy/sdk/util/PushyAsyncTask$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/pushy/sdk/util/PushyAsyncTask$Status;

    return-object v0
.end method
