.class Lcom/huawei/ui/openservice/db/control/OpenServiceControl$Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/db/control/OpenServiceControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Instance"
.end annotation


# static fields
.field public static final instance:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 81
    new-instance v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;-><init>(Lcom/huawei/ui/openservice/db/control/OpenServiceControl$1;)V

    sput-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl$Instance;->instance:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 82
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
