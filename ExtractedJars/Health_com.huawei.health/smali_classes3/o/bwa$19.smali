.class Lo/bwa$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->Q()V
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

    .line 593
    iput-object p1, p0, Lo/bwa$19;->b:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 596
    iget-object v0, p0, Lo/bwa$19;->b:Lo/bwa;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bwa;->c(Lo/bwa;Z)V

    .line 597
    return-void
.end method
