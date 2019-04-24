.class Lo/cgj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgj;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgj;


# direct methods
.method constructor <init>(Lo/cgj;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lo/cgj$3;->c:Lo/cgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 270
    iget-object v0, p0, Lo/cgj$3;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->f(Lo/cgj;)V

    .line 271
    return-void
.end method
