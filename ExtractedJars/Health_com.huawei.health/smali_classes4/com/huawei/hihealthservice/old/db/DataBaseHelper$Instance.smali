.class Lcom/huawei/hihealthservice/old/db/DataBaseHelper$Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/db/DataBaseHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Instance"
.end annotation


# static fields
.field public static helper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 69
    new-instance v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    invoke-static {}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->access$000()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;-><init>(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/DataBaseHelper$1;)V

    sput-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper$Instance;->helper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    .line 70
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
