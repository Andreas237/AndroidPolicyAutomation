.class final Lo/fdr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdr;->e(Landroid/view/View;ZLo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic e:Lo/acu;


# direct methods
.method constructor <init>(Lo/acu;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/fdr$5;->e:Lo/acu;

    iput-object p2, p0, Lo/fdr$5;->c:Landroid/widget/ImageView;

    iput-object p3, p0, Lo/fdr$5;->b:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 169
    iget-object v0, p0, Lo/fdr$5;->e:Lo/acu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acu;->e(B)V

    .line 170
    iget-object v0, p0, Lo/fdr$5;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fdr$5;->b:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/fdr;->a(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 171
    return-void
.end method
