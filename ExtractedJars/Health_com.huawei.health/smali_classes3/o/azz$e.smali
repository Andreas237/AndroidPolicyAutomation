.class final Lo/azz$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/azz;

.field private c:Z


# direct methods
.method public constructor <init>(Lo/azz;Z)V
    .locals 0

    .line 182
    iput-object p1, p0, Lo/azz$e;->b:Lo/azz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-boolean p2, p0, Lo/azz$e;->c:Z

    .line 184
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 188
    iget-object v0, p0, Lo/azz$e;->b:Lo/azz;

    iget-boolean v1, p0, Lo/azz$e;->c:Z

    invoke-static {v0, v1}, Lo/azz;->b(Lo/azz;Z)V

    .line 189
    return-void
.end method
