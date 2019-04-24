.class Lo/byo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byo;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/byo;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/byo;I)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/byo$2;->a:Lo/byo;

    iput p2, p0, Lo/byo$2;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 2

    .line 143
    iget-object v0, p0, Lo/byo$2;->a:Lo/byo;

    invoke-static {v0}, Lo/byo;->g(Lo/byo;)I

    move-result v0

    add-int/2addr v0, p1

    rem-int/lit8 v0, v0, 0xc

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lo/byo;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 138
    iget v0, p0, Lo/byo$2;->e:I

    return v0
.end method
