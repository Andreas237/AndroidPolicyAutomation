.class Lo/akt$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field private static final b:Lo/akt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 80
    new-instance v0, Lo/akt;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/akt;-><init>(Lo/akt$5;)V

    sput-object v0, Lo/akt$e;->b:Lo/akt;

    return-void
.end method

.method static synthetic b()Lo/akt;
    .locals 1

    .line 79
    sget-object v0, Lo/akt$e;->b:Lo/akt;

    return-object v0
.end method
