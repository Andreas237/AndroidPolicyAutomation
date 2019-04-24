.class Lo/eyo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezn$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyo;->c(Lo/ezn;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eyo;


# direct methods
.method constructor <init>(Lo/eyo;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lo/eyo$5;->d:Lo/eyo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(F)V
    .locals 1

    .line 161
    iget-object v0, p0, Lo/eyo$5;->d:Lo/eyo;

    invoke-static {v0, p1}, Lo/eyo;->e(Lo/eyo;F)V

    .line 162
    return-void
.end method
