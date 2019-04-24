.class public Lo/bfr$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfr$c$c;
    }
.end annotation


# instance fields
.field private b:Lo/bfr$c$c;

.field private e:I


# direct methods
.method public constructor <init>(Lo/bfr$c$c;I)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p1, p0, Lo/bfr$c;->b:Lo/bfr$c$c;

    .line 146
    iput p2, p0, Lo/bfr$c;->e:I

    .line 147
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 156
    iget v0, p0, Lo/bfr$c;->e:I

    return v0
.end method

.method public d()Lo/bfr$c$c;
    .locals 1

    .line 151
    iget-object v0, p0, Lo/bfr$c;->b:Lo/bfr$c$c;

    return-object v0
.end method
