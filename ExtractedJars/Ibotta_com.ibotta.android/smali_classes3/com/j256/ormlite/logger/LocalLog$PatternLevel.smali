.class Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
.super Ljava/lang/Object;
.source "LocalLog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/j256/ormlite/logger/LocalLog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PatternLevel"
.end annotation


# instance fields
.field level:Lcom/j256/ormlite/logger/Log$Level;

.field pattern:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;Lcom/j256/ormlite/logger/Log$Level;)V
    .locals 0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    iput-object p1, p0, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->pattern:Ljava/util/regex/Pattern;

    .line 214
    iput-object p2, p0, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->level:Lcom/j256/ormlite/logger/Log$Level;

    return-void
.end method
