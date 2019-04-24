.class public final enum Lcom/shopkick/app/gcm/GCMConstants$GCMAction;
.super Ljava/lang/Enum;
.source "GCMConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/gcm/GCMConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "GCMAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/gcm/GCMConstants$GCMAction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

.field public static final enum Message:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

.field public static final enum Register:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

.field public static final enum Unregister:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 13
    new-instance v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    const-string v1, "Register"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Register:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    .line 14
    new-instance v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    const-string v1, "Unregister"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Unregister:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    .line 15
    new-instance v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    const-string v1, "Message"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Message:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    const/4 v0, 0x3

    .line 12
    new-array v0, v0, [Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    sget-object v1, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Register:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Unregister:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Message:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->$VALUES:[Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/gcm/GCMConstants$GCMAction;
    .locals 1

    .line 12
    const-class v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/gcm/GCMConstants$GCMAction;
    .locals 1

    .line 12
    sget-object v0, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->$VALUES:[Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    invoke-virtual {v0}, [Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    return-object v0
.end method
