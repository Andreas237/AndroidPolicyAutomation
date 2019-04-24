.class Lcom/huawei/hwid/update/d/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/update/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/d/i;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/update/d/i;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/hwid/update/d/i$a;->a:Lcom/huawei/hwid/update/d/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/update/d/i;Lcom/huawei/hwid/update/d/i$1;)V
    .locals 0

    .line 216
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i$a;-><init>(Lcom/huawei/hwid/update/d/i;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i$a;->a:Lcom/huawei/hwid/update/d/i;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/d/i;->a(Lcom/huawei/hwid/update/d/i;I)V

    .line 223
    return-void
.end method
