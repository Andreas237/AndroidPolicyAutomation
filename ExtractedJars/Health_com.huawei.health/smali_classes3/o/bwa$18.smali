.class Lo/bwa$18;
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
.field final synthetic d:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lo/bwa$18;->d:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 590
    iget-object v0, p0, Lo/bwa$18;->d:Lo/bwa;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bwa;->c(Lo/bwa;Z)V

    .line 591
    return-void
.end method
