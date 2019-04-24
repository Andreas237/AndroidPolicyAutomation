.class public Lo/eih$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field final synthetic h:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 0

    .line 1327
    iput-object p1, p0, Lo/eih$k;->h:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 1330
    iget-object v0, p0, Lo/eih$k;->h:Lo/eih;

    invoke-static {v0}, Lo/eih;->e(Lo/eih;)Lo/eih$o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/eih$o;->d(Lo/eih$k;)V

    .line 1331
    return-void
.end method
