.class Lo/byo$10;
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
.field final synthetic a:I

.field final synthetic c:Lo/byo;


# direct methods
.method constructor <init>(Lo/byo;I)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/byo$10;->c:Lo/byo;

    iput p2, p0, Lo/byo$10;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 3

    .line 156
    iget-object v0, p0, Lo/byo$10;->c:Lo/byo;

    invoke-static {v0}, Lo/byo;->h(Lo/byo;)Ljava/util/Calendar;

    move-result-object v0

    iget-object v1, p0, Lo/byo$10;->c:Lo/byo;

    invoke-static {v1}, Lo/byo;->k(Lo/byo;)Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 157
    iget-object v0, p0, Lo/byo$10;->c:Lo/byo;

    invoke-static {v0}, Lo/byo;->h(Lo/byo;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 158
    iget-object v0, p0, Lo/byo$10;->c:Lo/byo;

    invoke-static {v0}, Lo/byo;->h(Lo/byo;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-static {v0}, Lo/byo;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 151
    iget v0, p0, Lo/byo$10;->a:I

    return v0
.end method
