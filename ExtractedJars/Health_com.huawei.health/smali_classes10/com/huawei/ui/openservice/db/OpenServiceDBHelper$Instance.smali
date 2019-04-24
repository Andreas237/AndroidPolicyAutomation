.class Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Instance"
.end annotation


# static fields
.field public static final db:Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 41
    new-instance v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;

    invoke-static {}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->access$000()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;-><init>(Landroid/content/Context;Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$1;)V

    sput-object v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$Instance;->db:Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;

    .line 42
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
