.class Lo/enu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enu;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enu;


# direct methods
.method constructor <init>(Lo/enu;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lo/enu$1;->b:Lo/enu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 190
    iget-object v0, p0, Lo/enu$1;->b:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->k()V

    .line 191
    return-void
.end method
