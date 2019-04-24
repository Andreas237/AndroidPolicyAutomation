.class Lo/cir$34$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir$34;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cir$34;


# direct methods
.method constructor <init>(Lo/cir$34;)V
    .locals 0

    .line 643
    iput-object p1, p0, Lo/cir$34$4;->b:Lo/cir$34;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 647
    iget-object v0, p0, Lo/cir$34$4;->b:Lo/cir$34;

    iget-object v0, v0, Lo/cir$34;->e:Lo/cir;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cir;->c(Lo/cir;I)I

    .line 648
    iget-object v0, p0, Lo/cir$34$4;->b:Lo/cir$34;

    iget-object v0, v0, Lo/cir$34;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->o(Lo/cir;)Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_main_page_sport_listen_book:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 649
    return-void
.end method
