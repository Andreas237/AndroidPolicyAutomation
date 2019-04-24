.class final enum Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;
.super Ljava/lang/Enum;
.source "FBConnectController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/controllers/FBConnectController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "FBConnectStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

.field public static final enum CANCELED:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

.field public static final enum FAILURE:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

.field public static final enum SUCCESS:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 38
    new-instance v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->SUCCESS:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    .line 39
    new-instance v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const-string v1, "FAILURE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->FAILURE:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    .line 40
    new-instance v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const-string v1, "CANCELED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->CANCELED:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const/4 v0, 0x3

    .line 37
    new-array v0, v0, [Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->SUCCESS:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->FAILURE:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->CANCELED:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->$VALUES:[Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;
    .locals 1

    .line 37
    const-class v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;
    .locals 1

    .line 37
    sget-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->$VALUES:[Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    invoke-virtual {v0}, [Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    return-object v0
.end method
