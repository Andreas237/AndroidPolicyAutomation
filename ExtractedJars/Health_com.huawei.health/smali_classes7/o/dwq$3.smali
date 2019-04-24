.class final Lo/dwq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwq;->a(Lo/dwr;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lo/dwr;


# direct methods
.method constructor <init>(Lo/dwr;Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/dwq$3;->e:Lo/dwr;

    iput-object p2, p0, Lo/dwq$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 52
    iget-object v0, p0, Lo/dwq$3;->e:Lo/dwr;

    iget-object v1, p0, Lo/dwq$3;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dwq;->c(Lo/dwr;Ljava/lang/String;)V

    .line 53
    return-void
.end method
