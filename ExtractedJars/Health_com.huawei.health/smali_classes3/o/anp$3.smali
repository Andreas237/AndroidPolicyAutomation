.class Lo/anp$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/amh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/anp;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/anp;


# direct methods
.method constructor <init>(Lo/anp;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lo/anp$3;->a:Lo/anp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 32
    iget-object v0, p0, Lo/anp$3;->a:Lo/anp;

    invoke-virtual {v0}, Lo/anp;->d()I

    .line 33
    return-void
.end method
