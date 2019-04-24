.class final Lo/ajb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ajb;->d(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aiq$d;

.field final synthetic c:Lo/ain;

.field final synthetic d:Lo/ail;

.field final synthetic e:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lo/ajb$1;->d:Lo/ail;

    iput-object p2, p0, Lo/ajb$1;->e:Ljava/lang/Integer;

    iput-object p3, p0, Lo/ajb$1;->c:Lo/ain;

    iput-object p4, p0, Lo/ajb$1;->a:Lo/aiq$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 400
    iget-object v0, p0, Lo/ajb$1;->d:Lo/ail;

    iget-object v1, p0, Lo/ajb$1;->e:Ljava/lang/Integer;

    iget-object v2, p0, Lo/ajb$1;->c:Lo/ain;

    iget-object v3, p0, Lo/ajb$1;->a:Lo/aiq$d;

    invoke-static {v0, v1, v2, v3}, Lo/ajb;->e(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V

    .line 401
    return-void
.end method
