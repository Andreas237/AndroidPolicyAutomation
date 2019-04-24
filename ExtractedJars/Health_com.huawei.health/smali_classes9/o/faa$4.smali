.class Lo/faa$4;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/faa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/faa;


# direct methods
.method constructor <init>(Lo/faa;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/faa$4;->c:Lo/faa;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 60
    iget-object v0, p0, Lo/faa$4;->c:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->c()V

    .line 61
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .line 64
    iget-object v0, p0, Lo/faa$4;->c:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->c()V

    .line 65
    return-void
.end method
