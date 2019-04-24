.class public final Lcom/squareup/leakcanary/Exclusion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final alwaysExclude:Z

.field public final matching:Ljava/lang/String;

.field public final name:Ljava/lang/String;

.field public final reason:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iget-object v0, p1, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/leakcanary/Exclusion;->name:Ljava/lang/String;

    .line 13
    iget-object v0, p1, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->reason:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/leakcanary/Exclusion;->reason:Ljava/lang/String;

    .line 14
    iget-boolean v0, p1, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->alwaysExclude:Z

    iput-boolean v0, p0, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    .line 15
    iget-object v0, p1, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->matching:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/leakcanary/Exclusion;->matching:Ljava/lang/String;

    .line 16
    return-void
.end method
