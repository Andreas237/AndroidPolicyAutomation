.class Lo/cir$30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->d(Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/TextView;

.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;Landroid/widget/TextView;)V
    .locals 0

    .line 1849
    iput-object p1, p0, Lo/cir$30;->d:Lo/cir;

    iput-object p2, p0, Lo/cir$30;->b:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1852
    iget-object v0, p0, Lo/cir$30;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1853
    return-void
.end method
