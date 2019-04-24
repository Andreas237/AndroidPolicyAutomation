.class Lcom/ibotta/android/permissions/PermissionStrategyImpl;
.super Ljava/lang/Object;
.source "PermissionStrategyImpl.java"

# interfaces
.implements Lcom/ibotta/android/permissions/PermissionStrategy;
.implements Lcom/ibotta/android/permissions/PermissionsListener;


# instance fields
.field private final criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

.field private enforcer:Lcom/ibotta/android/permissions/Enforcer;

.field private final permission:Lcom/ibotta/android/permissions/Permission;

.field private final permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

.field private final ruleSet:Lcom/ibotta/android/permissions/RuleSet;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/permissions/Permission;Lcom/ibotta/android/permissions/RuleSet;Lcom/ibotta/android/permissions/CriteriaStore;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->permission:Lcom/ibotta/android/permissions/Permission;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    const-string p1, "Initialized with: %1$d rules"

    const/4 p3, 0x1

    .line 33
    new-array p3, p3, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x0

    aput-object p2, p3, p4

    invoke-static {p1, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->initEnforcer()V

    return-void
.end method

.method private advancePhase()V
    .locals 4

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->getPhase()S

    move-result v0

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    invoke-virtual {v1}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->advancePhase()V

    :cond_0
    const-string v0, "Advanced phase to: phase=%1$s"

    .line 123
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v3}, Lcom/ibotta/android/permissions/CriteriaStore;->getPhase()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->reset()V

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->initEnforcer()V

    return-void
.end method

.method private initEnforcer()V
    .locals 5

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "No rules, enforcer creation will be skipped."

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->getPhase()S

    move-result v0

    const/4 v2, 0x1

    if-ltz v0, :cond_1

    .line 70
    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    invoke-virtual {v3}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    const-string v3, "Creating enforcer for phase: %1$s"

    .line 71
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-static {v3, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    invoke-virtual {v1}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/Rule;

    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->createEnforcer(Lcom/ibotta/android/permissions/Rule;Lcom/ibotta/android/permissions/CriteriaStore;)Lcom/ibotta/android/permissions/Enforcer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->enforcer:Lcom/ibotta/android/permissions/Enforcer;

    goto :goto_0

    :cond_1
    const-string v3, "Current phase is out of bounds: phase=%1$s"

    .line 74
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v1

    invoke-static {v3, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private showPermissionsPrompt(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;)V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->permission:Lcom/ibotta/android/permissions/Permission;

    .line 147
    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Permission;->getPermissionProfile()Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object v0

    .line 146
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->createPermissionHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p1

    .line 148
    invoke-interface {p1}, Lcom/ibotta/android/permissions/PermissionsHelper;->requestPermissions()V

    return-void
.end method


# virtual methods
.method public checkPermissionsForArea(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/Area;)Z
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->enforcer:Lcom/ibotta/android/permissions/Enforcer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lcom/ibotta/android/permissions/Enforcer;->isRuleSatisfied(Lcom/ibotta/android/state/app/permissions/Area;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->enforcer:Lcom/ibotta/android/permissions/Enforcer;

    invoke-interface {v2}, Lcom/ibotta/android/permissions/Enforcer;->getRule()Lcom/ibotta/android/permissions/Rule;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/ibotta/android/permissions/RuleSet;->getCopy(Lcom/ibotta/android/permissions/RuleSet;Lcom/ibotta/android/permissions/Rule;)Lcom/ibotta/android/permissions/Copy;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->showPermissionsPrompt(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;)V

    goto :goto_0

    :cond_0
    const-string p1, "DON\'T prompt for permissions."

    .line 93
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    :goto_0
    return v1
.end method

.method protected createEnforcer(Lcom/ibotta/android/permissions/Rule;Lcom/ibotta/android/permissions/CriteriaStore;)Lcom/ibotta/android/permissions/Enforcer;
    .locals 1

    .line 50
    new-instance v0, Lcom/ibotta/android/permissions/EnforcerImpl;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/permissions/EnforcerImpl;-><init>(Lcom/ibotta/android/permissions/Rule;Lcom/ibotta/android/permissions/CriteriaStore;)V

    return-object v0
.end method

.method protected createPermissionHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 6

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->createGenericPermissionsHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p1

    return-object p1
.end method

.method public delete()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->delete()V

    return-void
.end method

.method public getCriteriaStore()Lcom/ibotta/android/permissions/CriteriaStore;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    return-object v0
.end method

.method public getPermission()Lcom/ibotta/android/permissions/Permission;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->permission:Lcom/ibotta/android/permissions/Permission;

    return-object v0
.end method

.method public getRuleSet()Lcom/ibotta/android/permissions/RuleSet;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->ruleSet:Lcom/ibotta/android/permissions/RuleSet;

    return-object v0
.end method

.method public onPermissionsAccepted()V
    .locals 2

    const-string v0, "Permissions accepted."

    const/4 v1, 0x0

    .line 131
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onPermissionsDenied()V
    .locals 2

    const-string v0, "Permissions denied."

    const/4 v1, 0x0

    .line 136
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->advancePhase()V

    return-void
.end method

.method public onPermissionsPermanentlyDenied()V
    .locals 2

    const-string v0, "Permissions permanently denied."

    const/4 v1, 0x0

    .line 142
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public trackNewSession()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->addSession()V

    return-void
.end method
