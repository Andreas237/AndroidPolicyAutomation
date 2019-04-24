.class public final Lo/aut;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aut$c;
    }
.end annotation


# instance fields
.field private a:J

.field private d:Lo/auu$b;

.field private e:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method synthetic constructor <init>(Lo/aut$1;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lo/aut;-><init>()V

    return-void
.end method

.method public static c()Lo/aut;
    .locals 1

    .line 23
    sget-object v0, Lo/aut$c;->e:Lo/aut;

    return-object v0
.end method


# virtual methods
.method public a(Lo/auu$b;)V
    .locals 2

    .line 58
    iput-object p1, p0, Lo/aut;->d:Lo/auu$b;

    .line 59
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->a:J

    .line 60
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->e:J

    .line 61
    return-void
.end method

.method public a(Lo/auu$b;J)Z
    .locals 3

    .line 129
    const/4 v2, 0x0

    .line 130
    if-eqz p1, :cond_1

    iget-object v0, p0, Lo/aut;->d:Lo/auu$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/aut;->d:Lo/auu$b;

    .line 131
    invoke-virtual {v0}, Lo/auu$b;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Lo/auu$b;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 134
    invoke-virtual {p1}, Lo/auu$b;->ordinal()I

    move-result v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    invoke-virtual {v1}, Lo/auu$b;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lo/aut;->e:J

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    .line 137
    const/4 v2, 0x1

    goto :goto_0

    .line 140
    :cond_0
    iget-wide v0, p0, Lo/aut;->a:J

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 142
    const/4 v2, 0x1

    .line 145
    :cond_1
    :goto_0
    return v2
.end method

.method public b()V
    .locals 2

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aut;->d:Lo/auu$b;

    .line 98
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->a:J

    .line 99
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->e:J

    .line 100
    return-void
.end method

.method public c(Lo/auu$b;)Z
    .locals 3

    .line 110
    const/4 v2, 0x0

    .line 112
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/aut;->d:Lo/auu$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aut;->d:Lo/auu$b;

    .line 113
    invoke-virtual {v0}, Lo/auu$b;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Lo/auu$b;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 115
    const/4 v2, 0x1

    .line 117
    :cond_0
    return v2
.end method

.method public e(Lo/auu$b;J)V
    .locals 2

    .line 74
    iput-object p1, p0, Lo/aut;->d:Lo/auu$b;

    .line 76
    invoke-virtual {p1}, Lo/auu$b;->ordinal()I

    move-result v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    invoke-virtual {v1}, Lo/auu$b;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 79
    iput-wide p2, p0, Lo/aut;->e:J

    .line 80
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->a:J

    goto :goto_0

    .line 85
    :cond_0
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/aut;->e:J

    .line 86
    iput-wide p2, p0, Lo/aut;->a:J

    .line 88
    :goto_0
    return-void
.end method
