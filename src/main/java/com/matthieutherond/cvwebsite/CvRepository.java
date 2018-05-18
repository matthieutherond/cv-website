package com.matthieutherond.cvwebsite;

import org.springframework.data.jpa.repository.JpaRepository;

interface CvRepository extends JpaRepository<CuriculumVitae, Long> {
}
