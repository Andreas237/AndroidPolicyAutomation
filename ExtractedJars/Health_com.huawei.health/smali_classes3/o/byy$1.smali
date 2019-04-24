.class Lo/byy$1;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/byy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/byy;


# direct methods
.method constructor <init>(Lo/byy;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/byy$1;->a:Lo/byy;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 71
    iget-object v0, p0, Lo/byy$1;->a:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->e()V

    .line 72
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .line 78
    iget-object v0, p0, Lo/byy$1;->a:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->e()V

    .line 79
    return-void
.end method
