.class Lcom/huawei/hihealthservice/auth/HiAuthManager$Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/auth/HiAuthManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Instance"
.end annotation


# static fields
.field public static final instance:Lcom/huawei/hihealthservice/auth/HiAuthManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lcom/huawei/hihealthservice/auth/HiAuthManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/auth/HiAuthManager;-><init>(Lcom/huawei/hihealthservice/auth/HiAuthManager$1;)V

    sput-object v0, Lcom/huawei/hihealthservice/auth/HiAuthManager$Instance;->instance:Lcom/huawei/hihealthservice/auth/HiAuthManager;

    .line 39
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
