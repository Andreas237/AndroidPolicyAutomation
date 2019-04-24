.class Lo/bed$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bed;->b(Lo/bfp$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bed;


# direct methods
.method constructor <init>(Lo/bed;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/bed$1;->d:Lo/bed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 106
    iget-object v0, p0, Lo/bed$1;->d:Lo/bed;

    invoke-static {v0}, Lo/bed;->b(Lo/bed;)V

    .line 107
    return-void
.end method

.method public d()V
    .locals 0

    .line 112
    return-void
.end method
