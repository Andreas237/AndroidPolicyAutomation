.class public Lo/ceq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .line 11
    sput-object p0, Lo/ceq;->d:Landroid/content/Context;

    .line 12
    return-void
.end method

.method public static d()Landroid/content/Context;
    .locals 1

    .line 15
    sget-object v0, Lo/ceq;->d:Landroid/content/Context;

    return-object v0
.end method
