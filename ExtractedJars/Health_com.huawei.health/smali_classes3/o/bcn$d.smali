.class public Lo/bcn$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bcn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private b:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput p1, p0, Lo/bcn$d;->b:I

    .line 53
    return-void
.end method

.method synthetic constructor <init>(ILo/bcn$4;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/bcn$d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 57
    iget v0, p0, Lo/bcn$d;->b:I

    return v0
.end method
