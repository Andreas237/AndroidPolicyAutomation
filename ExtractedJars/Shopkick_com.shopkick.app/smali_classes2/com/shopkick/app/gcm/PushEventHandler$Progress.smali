.class public final enum Lcom/shopkick/app/gcm/PushEventHandler$Progress;
.super Ljava/lang/Enum;
.source "PushEventHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/gcm/PushEventHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Progress"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/gcm/PushEventHandler$Progress;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/gcm/PushEventHandler$Progress;

.field public static final enum Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

.field public static final enum Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

.field public static final enum Fail:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

.field public static final enum Pause:Lcom/shopkick/app/gcm/PushEventHandler$Progress;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 12
    new-instance v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    const-string v1, "Continue"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/gcm/PushEventHandler$Progress;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 13
    new-instance v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    const-string v1, "Pause"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/gcm/PushEventHandler$Progress;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Pause:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 14
    new-instance v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    const-string v1, "Fail"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/gcm/PushEventHandler$Progress;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Fail:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 15
    new-instance v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    const-string v1, "Done"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/gcm/PushEventHandler$Progress;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    const/4 v0, 0x4

    .line 11
    new-array v0, v0, [Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Pause:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Fail:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->$VALUES:[Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    .line 11
    const-class v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    .line 11
    sget-object v0, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->$VALUES:[Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    invoke-virtual {v0}, [Lcom/shopkick/app/gcm/PushEventHandler$Progress;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object v0
.end method
