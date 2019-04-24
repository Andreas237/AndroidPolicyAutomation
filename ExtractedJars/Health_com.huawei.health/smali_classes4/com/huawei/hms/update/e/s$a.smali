.class Lcom/huawei/hms/update/e/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/update/e/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/update/e/s;


# direct methods
.method private constructor <init>(Lcom/huawei/hms/update/e/s;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/hms/update/e/s$a;->a:Lcom/huawei/hms/update/e/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hms/update/e/s;Lcom/huawei/hms/update/e/t;)V
    .locals 0

    .line 210
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s$a;-><init>(Lcom/huawei/hms/update/e/s;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/huawei/hms/update/e/s$a;->a:Lcom/huawei/hms/update/e/s;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lcom/huawei/hms/update/e/s;->a(Lcom/huawei/hms/update/e/s;I)V

    .line 217
    return-void
.end method
