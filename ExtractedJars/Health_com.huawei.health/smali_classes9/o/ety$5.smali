.class Lo/ety$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ety;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ety;


# direct methods
.method constructor <init>(Lo/ety;)V
    .locals 0

    .line 361
    iput-object p1, p0, Lo/ety$5;->a:Lo/ety;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 364
    iget-object v0, p0, Lo/ety$5;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->g(Lo/ety;)V

    .line 365
    return-void
.end method
