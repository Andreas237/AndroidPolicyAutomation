.class Lo/bwa$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 733
    iput-object p1, p0, Lo/bwa$15;->b:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 736
    iget-object v0, p0, Lo/bwa$15;->b:Lo/bwa;

    iget-object v1, p0, Lo/bwa$15;->b:Lo/bwa;

    iget-object v1, v1, Lo/bwa;->b:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/bwa;->d(Lo/bwa;Landroid/widget/ImageView;Z)V

    .line 737
    return-void
.end method
