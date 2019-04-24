.class final enum Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

.field private static final synthetic b:[Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

.field public static final enum c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

.field public static final enum e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 57
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const-string v1, "PREVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 55
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->b:[Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;
    .locals 1

    .line 55
    const-class v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    return-object v0
.end method

.method public static values()[Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;
    .locals 1

    .line 55
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->b:[Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    invoke-virtual {v0}, [Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    return-object v0
.end method
