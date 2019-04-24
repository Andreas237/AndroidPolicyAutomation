.class Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr$Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Instance"
.end annotation


# static fields
.field public static final instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 29
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;-><init>(Landroid/content/Context;Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr$1;)V

    sput-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr$Instance;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;

    .line 30
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
