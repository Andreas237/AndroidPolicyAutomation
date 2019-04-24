.class public Lcom/ibotta/api/util/Dasherize;
.super Ljava/lang/Object;
.source "Dasherize.java"


# static fields
.field private static final REGEX_DASHERIZE_STEP_1:Ljava/lang/String; = "[^-\\w&]+"

.field private static final REGEX_DASHERIZE_STEP_2:Ljava/lang/String; = "^-+|-+$"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static dasherize(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "[^-\\w&]+"

    const-string v1, "-"

    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "^-+|-+$"

    const-string v1, ""

    .line 21
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
