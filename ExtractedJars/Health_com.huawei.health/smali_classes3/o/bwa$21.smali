.class Lo/bwa$21;
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
.field final synthetic c:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 618
    iput-object p1, p0, Lo/bwa$21;->c:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 622
    iget-object v0, p0, Lo/bwa$21;->c:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->d()V

    .line 623
    iget-object v0, p0, Lo/bwa$21;->c:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->c(Lo/bwa;)V

    .line 624
    return-void
.end method
