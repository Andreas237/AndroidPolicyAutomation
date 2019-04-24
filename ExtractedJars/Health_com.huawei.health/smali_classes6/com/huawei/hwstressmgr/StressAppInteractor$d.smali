.class Lcom/huawei/hwstressmgr/StressAppInteractor$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwstressmgr/StressAppInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static final c:Lcom/huawei/hwstressmgr/StressAppInteractor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 94
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V

    sput-object v0, Lcom/huawei/hwstressmgr/StressAppInteractor$d;->c:Lcom/huawei/hwstressmgr/StressAppInteractor;

    return-void
.end method

.method static synthetic d()Lcom/huawei/hwstressmgr/StressAppInteractor;
    .locals 1

    .line 93
    sget-object v0, Lcom/huawei/hwstressmgr/StressAppInteractor$d;->c:Lcom/huawei/hwstressmgr/StressAppInteractor;

    return-object v0
.end method
