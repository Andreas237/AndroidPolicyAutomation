.class final Lcom/huawei/wallet/logic/bi/AppStartHianalytics$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->a(Landroid/content/Context;)V

    .line 137
    return-void
.end method
